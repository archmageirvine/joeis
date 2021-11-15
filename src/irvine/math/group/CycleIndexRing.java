package irvine.math.group;

import java.util.Iterator;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomialOperation;
import irvine.math.polynomial.StandardMultiply;
import irvine.math.z.Z;

/**
 * Adapter to make cycle index object behave like a ring.
 * @author Sean A. Irvine
 */
public class CycleIndexRing extends AbstractRing<CycleIndex> {

  private final MultivariateMonomialOperation mOp;

  /**
   * Construct a cycle index ring with the specified multiplication operation.
   * @param op operation
   */
  public CycleIndexRing(final MultivariateMonomialOperation op) {
    mOp = op;
  }

  /**
   * Construct a cycle index ring with ordinary multiplication.
   */
  public CycleIndexRing() {
    this(StandardMultiply.OP);
  }

  @Override
  public CycleIndex zero() {
    return CycleIndex.ZERO;
  }

  @Override
  public CycleIndex add(final CycleIndex a, final CycleIndex b) {
    final CycleIndex res = a.copy();
    res.add(b);
    res.setName("");
    return res;
  }

  @Override
  public CycleIndex negate(final CycleIndex a) {
    final CycleIndex res = zero().copy();
    res.subtract(a);
    res.setName("");
    return res;
  }

  @Override
  public boolean isCommutative() {
    // depends on op
    throw new UnsupportedOperationException();
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean contains(final CycleIndex element) {
    return element != null;
  }

  @Override
  public Iterator<CycleIndex> iterator() {
    throw new UnsupportedOperationException();
  }

  @Override
  public CycleIndex one() {
    return CycleIndex.ONE;
  }

  @Override
  public CycleIndex multiply(final CycleIndex a, final CycleIndex b) {
    final CycleIndex res = a.op(mOp, b);
    res.setName("");
    return res;
  }
}
