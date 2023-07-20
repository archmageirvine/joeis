package irvine.oeis.a063;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A063884 a(1) = 2, a(2) = 3 and a(k+1) is the least prime not already chosen that divides some a(i)*a(j)+1, where 1&lt;=i&lt;=j&lt;=k.
 * @author Sean A. Irvine
 */
public class A063884 extends MemorySequence {

  /** Construct the sequence. */
  public A063884() {
    this(1);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A063884(final int offset) {
    super(offset);
  }

  protected final TreeSet<Z> mA = new TreeSet<>();
  protected final HashSet<Z> mUsed = new HashSet<>();

  {
    mA.add(Z.TWO);
    mA.add(Z.THREE);
  }

  protected void update(final Z n) {
    for (final Z p : Jaguar.factor(n).toZArray()) {
      if (!mUsed.contains(p)) {
        mA.add(p);
      }
    }
  }

  @Override
  protected Z computeNext() {
    final Z t = mA.pollFirst();
    mUsed.add(t);
    update(t.square().add(1)); // needed because we did not yet add to the sequence
    for (final Z v : this) {
      update(v.multiply(t).add(1));
    }
    return t;
  }
}
