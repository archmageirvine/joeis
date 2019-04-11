package irvine.oeis.a016;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a010.A010790;

/**
 * A016065 <code>a(n) =</code> Sum_{k=0..n} <code>k!*(k+1)!</code>.
 * @author Sean A. Irvine
 */
public class A016065 extends PartialSumSequence {

  /** Construct the sequence. */
  public A016065() {
    super(new A010790());
  }
}
