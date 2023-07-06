package irvine.oeis.a060;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002110;

/**
 * A060389 a(1)=p_1, a(2)=p_1 + p_1*p_2, a(3)=p_1 + p_1*p_2 + p_1*p_2*p_3, ... where p_i is the i-th prime.
 * @author Sean A. Irvine
 */
public class A060389 extends PartialSumSequence {

  /** Construct the sequence. */
  public A060389() {
    super(1, new A002110().skip(1));
  }
}
