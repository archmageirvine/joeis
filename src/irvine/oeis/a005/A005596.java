package irvine.oeis.a005;

import irvine.oeis.a065.A065488;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A005596 Decimal expansion of Artin's constant Product_{p=prime} (1-1/(p^2-p)).
 * @author Sean A. Irvine
 */
public class A005596 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A005596() {
    super(0, new A065488().getCR().inverse());
  }
}
