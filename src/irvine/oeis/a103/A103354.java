package irvine.oeis.a103;
// generated by patch_offset.pl at 2023-06-16 18:27

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006697;

/**
 * A103354 a(n) = floor(x), where x is the solution to x = 2^(n-x).
 * @author Sean A. Irvine
 */
public class A103354 extends DifferenceSequence {

  /** Construct the sequence. */
  public A103354() {
    super(1, new PrependSequence(new A006697(), 0));
  }
}
