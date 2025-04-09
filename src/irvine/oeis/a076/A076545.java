package irvine.oeis.a076;

import irvine.oeis.PartialSumSequence;

/**
 * A076545 a(n) = Sum_{k=1..n} (mu(k) + sqf(k)) where mu(k) is Moebius function, sqf(k)=1 if k is squarefree and sqf(k)=-1 otherwise.
 * @author Sean A. Irvine
 */
public class A076545 extends PartialSumSequence {

  /** Construct the sequence. */
  public A076545() {
    super(1, new A076544());
  }
}
