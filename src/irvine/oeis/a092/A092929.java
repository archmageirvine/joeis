package irvine.oeis.a092;
// generated by patch_offset.pl at 2023-06-16 18:27

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a164.A164931;

/**
 * A092929 n-th partial arithmetic mean is equal to the n-th noncomposite number or to prime(n-1) for n&gt;1.
 * @author Sean A. Irvine
 */
public class A092929 extends DifferenceSequence {

  /** Construct the sequence. */
  public A092929() {
    super(1, new PrependSequence(new A164931(), 0));
  }
}
