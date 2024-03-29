package irvine.oeis.a098;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A098693 G.f.: q*Product_{k&gt;0} (1-q^(12k))(1+q^(12k-1))(1+q^(12k-11))/(1-q^k).
 * @author Georg Fischer
 */
public class A098693 extends EulerTransform {

  /** Construct the sequence. */
  public A098693() {
    super(1, new PeriodicSequence(2, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 0, 2, 0), 1);
  }
}
