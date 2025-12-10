package irvine.oeis.a390;

import irvine.math.z.Z;

/**
 * A390942 Value of T[2] after the n-th iteration, when the map T is initialized with T[1] = 1 and in subsequent iterations, T[v] = k + (T[v] if defined else 0) for all key-value pairs (k, v) in T; a(n) = 0 if T[2] isn't defined yet.
 * @author Sean A. Irvine
 */
public class A390942 extends A390944 {

  /** Construct the sequence. */
  public A390942() {
    super(Z.TWO);
  }
}
