package irvine.oeis.a078;
// Generated by gen_seq4.pl essent 1 A006165 at 2020-09-22 11:56
// DO NOT EDIT here!

import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006165;


/**
 * A078881 Size of the largest subset S of {1,2,3,...,n} with the property that if i and j are distinct elements of S then i XOR j is not in S, where XOR is the bitwise exclusive-OR operator.
 * @author Georg Fischer
 */
public class A078881 extends PrependSequence {

  /** Construct the sequence. */
  public A078881() {
    super(1, new A006165());
  }
}
