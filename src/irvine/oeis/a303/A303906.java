package irvine.oeis.a303;
// Generated by gen_seq4.pl diffspp at 2020-09-22 15:10
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007294;

/**
 * A303906 Expansion of Product_{k&gt;=2} 1/(1 - x^(k*(k+1)/2)).
 * @author Georg Fischer
 */
public class A303906 extends PrependSequence {

  /** Construct the sequence. */
  public A303906() {
    super(new DifferenceSequence(new A007294()), 1);
  }
}
