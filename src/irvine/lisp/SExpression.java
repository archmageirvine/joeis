package irvine.lisp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Lisp like list.
 * @author Sean A. Irvine
 */
public final class SExpression extends ArrayList<SExpression> {

  private static int lg(final Z n) {
    return n.bitLength() - 1;
  }

  private static Z peelNextBalSubSeq(final Z nn) {
    if (nn.isZero()) {
      return Z.ZERO;
    }
    Z n = nn;
    long c = 0;
    Z z = Z.ZERO;
    while (true) {
      z = z.multiply2().add(n.mod(2));
      c += n.isEven() ? 1 : -1;
      n = n.divide2();
      if (c >= 0) {
        return z.subtract(Z.ONE.shiftLeft(lg(z))).divide2();
      }
    }
  }

  private static Z restBalSubSeq(final Z nn) {
    Z n = nn;
    long c = 0;
    do {
      c += n.isEven() ? 1 : -1;
      n = n.divide2();
    } while (c < 0);
    Z z = Z.ZERO;
    c = -1;
    while (true) {
      z = z.multiply2().add(n.mod(2));
      c += n.isEven() ? 1 : -1;
      n = n.divide2();
      if (c > 0) {
        return z.divide2();
      }
    }
  }

  private static SExpression binexp2parsR(final Z n) {
    final SExpression s = new SExpression();
    s.add(SExpression.binexp2pars(peelNextBalSubSeq(n)));
    s.addAll(SExpression.binexp2pars(restBalSubSeq(n)));
    return s;
  }

  /**
   * Create an S expression from a number.
   * @param n number
   * @return expression
   */
  public static SExpression binexp2pars(final Z n) {
    return n.isZero() ? new SExpression() : binexp2parsR(Functions.REVERSE.z(2, n));
  }

  /**
   * Combine left and right subtrees into a tree.
   * @param left left subtree
   * @param right right subtree
   * @return combined tree
   */
  public static SExpression createTree(final SExpression left, final SExpression right) {
    final SExpression res = new SExpression();
    res.add(left);
    res.addAll(right);
    return res;
  }

  /** Construct an empty S expression. */
  public SExpression() {
  }

  /**
   * Construct an S expression containing other expressions.
   * @param expressions S expressions
   */
  public SExpression(final SExpression... expressions) {
    addAll(Arrays.asList(expressions));
  }

  // (define (swap! s) (let ((ex-car (car s))) (set-car! s (cdr s)) (set-cdr! s ex-car) s))
  /**
   * In place exchange.
   * @param s expression
   * @return swapped expression
   */
  public static SExpression swap(final SExpression s) {
    final SExpression exCar = s.car();
    s.setCar(s.cdr());
    s.setCdr(exCar);
    return s;
  }

  // (define (robr! s) (let ((ex-cdr (cdr s))) (set-cdr! s (caar s)) (set-car! (car s) ex-cdr) (swap! (car s)) (swap! s) s))
  /**
   * Rob right.
   * @param s expression
   * @return rob right
   */
  public static SExpression robr(final SExpression s) {
    final SExpression exCdr = s.cdr();
    s.setCdr(s.caar());
    s.car().setCar(exCdr);
    swap(s.car());
    swap(s);
    return s;
  }

  // (define (robl! s) (let ((ex-car (car s))) (set-car! s (cddr s)) (set-cdr! (cdr s) ex-car) (swap! (cdr s)) (swap! s) s))
  /**
   * Rob left.
   * @param s expression
   * @return rob left
   */
  public static SExpression robl(final SExpression s) {
    final SExpression exCar = s.car();
    s.setCar(s.cddr());
    s.setCdr(swap(s.cdr().setCdr(exCar)));
    swap(s);
    return s;
  }

  /**
   * Return the first element of the expression.
   * @return first element.
   */
  public SExpression car() {
    if (isEmpty()) {
      return new SExpression();
    } else {
      return get(0);
    }
  }

  /**
   * Return everything except the first element of the list.
   * @return tail of the list
   */
  public SExpression cdr() {
    if (isEmpty()) {
      return new SExpression();
    } else {
      // It would be nice not to have to make this copy!
      final SExpression res = new SExpression();
      res.addAll(subList(1, size()));
      return res;
    }
  }

  /**
   * Return the first element of the first element in the expression.
   * @return first of the first element.
   */
  public SExpression caar() {
    return car().car();
  }

  /**
   * Return the tail of the tail.
   * @return tail of the fail.
   */
  public SExpression cddr() {
    return cdr().cdr();
  }

  /**
   * Reverse of the expression.
   * @return reverse
   */
  public SExpression reverse() {
    final SExpression s = new SExpression();
    s.addAll(this);
    Collections.reverse(s);
    return s;
  }

  /**
   * Reverse of the expression.
   * @return reverse
   */
  public SExpression deepReverse() {
    if (isEmpty()) {
      return this;
    }
    final SExpression s = new SExpression();
    for (final SExpression t : this) {
      s.add(t.deepReverse());
    }
    return s.reverse();
  }

  /**
   * Rotate the expression one position to the left.
   * @return rotation
   */
  public SExpression rotateLeft() {
    if (isEmpty()) {
      return this;
    }
    final SExpression s = new SExpression();
    s.addAll(subList(1, size()));
    s.add(get(0));
    return s;
  }

  /**
   * Rotate the expression one position to the left.
   * @return rotation
   */
  public SExpression deepRotateLeft() {
    if (isEmpty()) {
      return this;
    }
    final SExpression s = new SExpression();
    for (final SExpression t : this) {
      s.add(t.deepRotateLeft());
    }
    return s.rotateLeft();
  }

  /**
   * Perform the knick operation described in A069767.
   * @return S expression.
   */
  public SExpression knick() {
    if (isEmpty()) {
      return this;
    }
    final SExpression res = new SExpression();
    res.add(cdr());
    final SExpression car = car();
    res.addAll(car.knick());
    return res;
  }

  /**
   * Perform the knack operation described in A069768.
   * @return S expression.
   */
  public SExpression knack() {
    if (isEmpty()) {
      return this;
    }
    final SExpression res = new SExpression();
    res.add(cdr().knack());
    res.addAll(car());
    return res;
  }

  /**
   * Exchange left and right branches of the S expression
   * @return S expression.
   */
  public SExpression exch() {
    if (isEmpty()) {
      return this;
    }
    final SExpression res = new SExpression();
    res.add(cdr());
    res.addAll(car());
    return res;
  }

  /**
   * Convert an S expression into a number.
   * @return number
   */
  public Z toZ() {
    if (isEmpty()) {
      return Z.ZERO;
    }
    Z e = Z.ZERO;
    for (final SExpression s : this) {
      final Z x = s.toZ();
      final int w = lg(x);
      e = e.shiftLeft(w + 3).add(Z.ONE.shiftLeft(w + 2)).add(x.multiply2());
    }
    return e;
  }

  /**
   * Count the number of parentheses in this expression.
   * @return count of parentheses
   */
  public int countParens() {
    if (isEmpty()) {
      return 0;
    }
    int e = 0;
    for (final SExpression k : this) {
      e += 2 + k.countParens();
    }
    return e;
  }

  /**
   * Test if this expression is a pair in Scheme parlance.
   * @return true iff the expression is a pair
   */
  public boolean isPair() {
    return !isEmpty();
  }

  /**
   * Overwrite the tail of the list with a new expression.
   * Note this modifies in place.
   * @param s expression
   * @return list
   */
  public SExpression setCdr(final SExpression s) {
    if (size() > 0) {
      removeRange(1, size());
    }
    addAll(s);
    return this;
  }

  /**
   * Overwrite the head of the list with a new expression.
   * Note this modifies in place.
   * @param s expression
   * @return list
   */
  public SExpression setCar(final SExpression s) {
    if (!isEmpty()) {
      set(0, s);
    } else {
      add(s);
    }
    return this;
  }

  /**
   * Return a deep copy of this expression.
   * @return copy
   */
  public SExpression copy() {
    final SExpression s = new SExpression();
    for (final SExpression e : this) {
      s.add(e.copy());
    }
    return s;
  }
}
