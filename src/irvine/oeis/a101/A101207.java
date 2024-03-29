package irvine.oeis.a101;
// generated by patch_offset.pl at 2023-06-16 18:27

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a056.A056793;

/**
 * A101207 For each prime power n, a(n) is the number of positive integers that have n as their greatest prime power.
 * @author Sean A. Irvine
 */
public class A101207 extends DifferenceSequence {

  /** Construct the sequence. */
  public A101207() {
    super(1, new PrependSequence(new A056793(), 0));
  }
}
