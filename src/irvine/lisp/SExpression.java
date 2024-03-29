package irvine.lisp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

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
    return n.isZero() ? new SExpression() : binexp2parsR(ZUtils.reverse(n, 2));
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
      final SExpression res = new SExpression();
      res.addAll(subList(1, size()));
      return res;
    }
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

  // deepreverse := proc(a) if 0 = nops(a) or list <> whattype(a) then (a) else [op(deepreverse(cdr(a))), deepreverse(a[1])]; fi; end;
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
}
