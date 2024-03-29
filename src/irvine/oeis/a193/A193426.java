package irvine.oeis.a193;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A193426 Expansion of (a(q^2) + a(q^3) - 2*a(q^6)) / 6 in powers of q where a() is a cubic AGM function.
 * @author Georg Fischer
 */
public class A193426 extends EulerTransform {

  /** Construct the sequence. */
  public A193426() {
    super(1, new PeriodicSequence(1, -1, 0, -1, 1, 0, 1, -1, 2, -1, 1, 0, 1, -1, 0, -1, 1, -2), 0, 1);
  }
}
