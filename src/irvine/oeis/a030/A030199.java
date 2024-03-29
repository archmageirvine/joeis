package irvine.oeis.a030;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A030199 Expansion of x * Product_{k&gt;=1} (1 - x^k) * (1 - x^(23*k)).
 * @author Georg Fischer
 */
public class A030199 extends EulerTransform {

  /** Construct the sequence. */
  public A030199() {
    super(1, new PeriodicSequence(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -2), 1);
  }
}
