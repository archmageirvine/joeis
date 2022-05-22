package irvine.oeis.a057;

import irvine.oeis.InverseSequence;
import irvine.oeis.a069.A069836;

/**
 * A057033 Let P(n) of a sequence s(1),s(2),s(3),... be obtained by leaving s(1),...s(n-1) fixed and reverse-cyclically permuting every n consecutive terms thereafter; apply P(2) to 1,2,3,... to get PS(2), then apply P(3) to PS(2) to get PS(3), then apply P(4) to PS(3), etc. The limit of PS(n) is A057033.
 * @author Sean A. Irvine
 */
public class A057033 extends InverseSequence {

  /** Construct the sequence. */
  public A057033() {
    super(new A069836());
  }
}
