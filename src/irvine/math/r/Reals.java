package irvine.math.r;

import java.util.Iterator;

import irvine.math.api.Ei;
import irvine.math.api.Exp;
import irvine.math.api.Gamma;
import irvine.math.api.HyperbolicTrigonometric;
import irvine.math.api.Pow;
import irvine.math.api.Sqrt;
import irvine.math.api.Trigonometric;
import irvine.math.group.AbstractOrderedField;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Field of real numbers under addition and multiplication.
 * @author Sean A. Irvine
 */
public final class Reals extends AbstractOrderedField<Double> implements Exp<Double>, HyperbolicTrigonometric<Double>, Gamma<Double>, Pow<Double>, Sqrt<Double>, Trigonometric<Double>, Ei<Double> {

  /** Field of real numbers under addition and multiplication. */
  public static final Reals SINGLETON = new Reals();

  private Reals() { }

  @Override
  public Double zero() {
    return 0.0;
  }

  @Override
  public Double one() {
    return 1.0;
  }

  @Override
  public Double add(final Double a, final Double b) {
    return a + b;
  }

  @Override
  public Double subtract(final Double a, final Double b) {
    return a - b;
  }

  @Override
  public Double multiply(final Double a, final Double b) {
    return a * b;
  }

  @Override
  public Double pow(final Double a, final long n) {
    return Math.pow(a, n);
  }

  @Override
  public Double pow(final Double a, final Double e) {
    return Math.pow(a, e);
  }

  @Override
  public Double divide(final Double n, final Double d) {
    return n / d;
  }

  @Override
  public Double negate(final Double a) {
    return -a;
  }

  @Override
  public Double inverse(final Double a) {
    return 1.0 / a;
  }
  
  @Override
  public Double exp(final Double n) {
    return Math.exp(n);
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
  public boolean contains(final Double element) {
    return element != null;
  }

  private static class RealIterator extends AbstractIterator<Double> {
    @Override
    public boolean hasNext() {
      return true;
    }

    private double mN = -1;

    @Override
    public Double next() {
      return ++mN;
    }
  }

  @Override
  public Iterator<Double> iterator() {
    return new RealIterator();
  }

  @Override
  public boolean isCommutative() {
    return true;
  }

  @Override
  public String toString() {
    return "\\R";
  }

  @Override
  public Double sqrt(final Double n) {
    return Math.sqrt(n);
  }

  @Override
  public Double sinh(final Double n) {
    return Math.sinh(n);
  }

  @Override
  public Double cosh(final Double n) {
    return Math.cosh(n);
  }

  @Override
  public Double tanh(final Double n) {
    return Math.tanh(n);
  }

  @Override
  public Double coth(final Double n) {
    return 1 / Math.tanh(n);
  }

  @Override
  public Double sech(final Double n) {
    return 1 / Math.cosh(n);
  }

  @Override
  public Double csch(final Double n) {
    return 1 / Math.sinh(n);
  }

  @Override
  public Double sin(final Double n) {
    return Math.sin(n);
  }

  @Override
  public Double cos(final Double n) {
    return Math.cos(n);
  }

  @Override
  public Double tan(final Double n) {
    return Math.tan(n);
  }

  @Override
  public Double cot(final Double n) {
    return 1.0 / Math.tan(n);
  }

  @Override
  public Double sec(final Double n) {
    return 1.0 / Math.cos(n);
  }

  @Override
  public Double csc(final Double n) {
    return 1.0 / Math.sin(n);
  }

  @Override
  public Double asin(final Double n) {
    return Math.asin(n);
  }

  @Override
  public Double acos(final Double n) {
    return Math.acos(n);
  }

  @Override
  public Double atan(final Double n) {
    return Math.atan(n);
  }

  @Override
  public Double gamma(final Double n) {
    return irvine.math.r.Gamma.gamma(n);
  }

  @Override
  public Double ei(final Double n) {
    return Exponential.ei(n);
  }

  @Override
  public Z characteristic() {
    return Z.ZERO;
  }

  @Override
  public int compare(final Double a, final Double b) {
    return a.compareTo(b);
  }

  @Override
  public Double coerce(final long n) {
    return (double) n;
  }
}
