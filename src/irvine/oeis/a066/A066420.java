package irvine.oeis.a066;

import irvine.oeis.NestedSequence;
import irvine.oeis.a007.A007374;
import irvine.oeis.a049.A049283;

/**
 * A066272.
 * @author Sean A. Irvine
 */
public class A066420 extends NestedSequence {

  /** Construct the sequence. */
  public A066420() {
    super(2, new A049283(), new A007374());
  }
}
