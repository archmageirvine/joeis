package irvine.oeis.a016;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a010.A010790;

/**
 * A016065 a(n) = Sum_{k=0..n} k!*(k+1)!.
 * @author Sean A. Irvine
 */
public class A016065 extends PartialSumSequence {

  /** Construct the sequence. */
  public A016065() {
    super(new A010790());
  }
}
