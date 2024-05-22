package irvine.math.function;

import java.util.Collection;

import irvine.math.z.Z;

/**
 * Product of the values.
 * @author Sean A. Irvine
 */
class Product extends AbstractFunctionN {

  @Override
  public Z z(final Collection<Z> values) {
    Z prod = Z.ONE;
    for (final Z v : values) {
      prod = prod.multiply(v);
      if (prod.isZero()) {
        return Z.ZERO;
      }
    }
    return prod;
  }

  @Override
  public Z z(final Z... values) {
    Z prod = Z.ONE;
    for (final Z v : values) {
      prod = prod.multiply(v);
      if (prod.isZero()) {
        return Z.ZERO;
      }
    }
    return prod;
  }

  @Override
  public Z z(final long... values) {
    Z prod = Z.ONE;
    for (final long v : values) {
      prod = prod.multiply(v);
      if (prod.isZero()) {
        return Z.ZERO;
      }
    }
    return prod;
  }

  @Override
  public Z z(final int... values) {
    Z prod = Z.ONE;
    for (final long v : values) {
      prod = prod.multiply(v);
      if (prod.isZero()) {
        return Z.ZERO;
      }
    }
    return prod;
  }

  @Override
  public int i(final int... values) {
    return z(values).intValueExact();
  }

  @Override
  public long l(final long... values) {
    return z(values).longValueExact();
  }
}
