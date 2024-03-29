package irvine.oeis.a092;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A092833 Expansion of q / (chi(-q) * chi(-q^23)) in powers of q where chi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A092833 extends EulerTransform {

  /** Construct the sequence. */
  public A092833() {
    super(1, new PaddingSequence(new long[] {}, new long[] {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0}), 1);
  }
}
