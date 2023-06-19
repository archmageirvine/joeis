package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000041;
import irvine.oeis.a047.A047993;

/**
 * A064174 Number of partitions of n with nonnegative rank.
 * @author Sean A. Irvine
 */
public class A064174 extends Combiner {

  /** Construct the sequence. */
  public A064174() {
    super(1, new A000041().skip(), new A047993(), ADD);
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

