package irvine.oeis.a005;

import irvine.oeis.FactorizationSequence;

/**
 * A005265 a(1)=3, b(n)=Product_{k=1..n} a(k), a(n+1)=smallest prime factor of b(n)-1.
 * @author Sean A. Irvine
 */
public class A005265 extends FactorizationSequence {

  /**
   * Construct this sequence.
   */
  public A005265() {
    super("irvine/factor/project/oeis/a005265");
  }
}
