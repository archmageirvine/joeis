package irvine.math.cr;

import java.util.Iterator;

import irvine.math.api.Ei;
import irvine.math.api.Exp;
import irvine.math.api.HyperbolicTrigonometric;
import irvine.math.api.Pow;
import irvine.math.api.Sqrt;
import irvine.math.api.Trigonometric;
import irvine.math.generic.HyperbolicTrigonometricImpl;
import irvine.math.group.AbstractOrderedField;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Field of real numbers under addition and multiplication.
 * @author Sean A. Irvine
 */
public final class ComputableReals extends AbstractOrderedField<CR> implements Exp<CR>, HyperbolicTrigonometric<CR>, Pow<CR>, Sqrt<CR>, Trigonometric<CR>, Ei<CR> {

  /** Field of real numbers under addition and multiplication. */
  public static final ComputableReals SINGLETON = new ComputableReals();

  private ComputableReals() { }

  @Override
  public CR zero() {
    return CR.ZERO;
  }

  @Override
  public CR one() {
    return CR.ONE;
  }

  @Override
  public CR add(final CR a, final CR b) {
    return a.add(b);
  }

  @Override
  public CR subtract(final CR a, final CR b) {
    return a.subtract(b);
  }

  @Override
  public CR multiply(final CR a, final CR b) {
    return a.multiply(b);
  }

  @Override
  public CR divide(final CR n, final CR d) {
    return n.divide(d);
  }

  @Override
  public CR negate(final CR a) {
    return a.negate();
  }

  @Override
  public CR inverse(final CR a) {
    return a.inverse();
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean isCyclic() {
    return false;
  }

  @Override
  public boolean contains(final CR element) {
    return element != null;
  }

  private static class ConstructiveRealsIterator extends AbstractIterator<CR> {
    @Override
    public boolean hasNext() {
      return true;
    }

    private long mN = -1;

    @Override
    public CR next() {
      return CR.valueOf(++mN);
    }
  }

  @Override
  public Iterator<CR> iterator() {
    return new ConstructiveRealsIterator();
  }

  @Override
  public String toString() {
    return "\\R";
  }

  @Override
  public CR sqrt(final CR n) {
    return n.sqrt();
  }

  @Override
  public CR exp(final CR n) {
    return n.exp();
  }

  @Override
  public CR sinh(final CR n) {
    return HyperbolicTrigonometricImpl.sinh(this, CR.HALF, n);
  }
  
  @Override
  public CR cosh(final CR n) {
    return HyperbolicTrigonometricImpl.cosh(this, CR.HALF, n);
  }

  @Override
  public CR tanh(final CR n) {
    return HyperbolicTrigonometricImpl.tanh(this, n);
  }

  @Override
  public CR coth(final CR n) {
    return HyperbolicTrigonometricImpl.coth(this, n);
  }

  @Override
  public CR sech(final CR n) {
    return HyperbolicTrigonometricImpl.sech(this, CR.TWO, n);
  }

  @Override
  public CR csch(final CR n) {
    return HyperbolicTrigonometricImpl.csch(this, CR.TWO, n);
  }

  @Override
  public CR sin(final CR n) {
    return n.sin();
  }

  @Override
  public CR cos(final CR n) {
    return n.cos();
  }

  @Override
  public CR tan(final CR n) {
    return UnaryCRFunction.TAN.execute(n);
  }

  @Override
  public CR cot(final CR n) {
    return UnaryCRFunction.TAN.execute(n).inverse();
  }

  @Override
  public CR csc(final CR n) {
    return n.sin().inverse();
  }

  @Override
  public CR sec(final CR n) {
    return n.cos().inverse();
  }

  @Override
  public CR asin(final CR n) {
    return UnaryCRFunction.ASIN.execute(n);
  }

  @Override
  public CR acos(final CR n) {
    return UnaryCRFunction.ACOS.execute(n);
  }

  @Override
  public CR atan(final CR n) {
    return UnaryCRFunction.ATAN.execute(n);
  }

  @Override
  public CR acot(final CR n) {
    return UnaryCRFunction.ACOT.execute(n);
  }

  /**
   * Return <code>n^e</code> for computable reals <code>n</code> and <code>e</code>.
   * @param n base
   * @param e exponent
   * @return power
   */
  @Override
  public CR pow(final CR n, final CR e) {
    return e.multiply(n.log()).exp();
  }

  @Override
  public CR ei(final CR n) {
    return n.ei();
  }

  @Override
  public Z characteristic() {
    return Z.ZERO;
  }

  @Override
  public int compare(final CR a, final CR b) {
    return a.compareTo(b);
  }

  @Override
  public CR coerce(final long n) {
    return CR.valueOf(n);
  }
}
