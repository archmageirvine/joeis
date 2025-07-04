package irvine.oeis.a133;
// generated by patch_offset.pl at 2023-04-27 10:21

import irvine.oeis.InterleaveSequence;
import irvine.oeis.a001.A001045;
import irvine.oeis.a033.A033999;

/**
 * A133730 Alternating sign sequence A033999 interleaved with Jacobsthal sequence A001045.
 * @author Georg Fischer
 */
public class A133730 extends InterleaveSequence {

  /** Construct the sequence. */
  public A133730() {
    super(0, new A033999(), new A001045());
  }
}
