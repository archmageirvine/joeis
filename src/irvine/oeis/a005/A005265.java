package irvine.oeis.a005;

import irvine.oeis.FactorizationSequence;

/**
 * A005265 <code>a(1)=3, b(n)=Product_{k=1..n} a(k),</code> a(n+1)=smallest prime factor of <code>b(n)-1</code>.
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
