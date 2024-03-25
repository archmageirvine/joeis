package irvine.oeis.a068;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a003.A003277;
import irvine.oeis.a005.A005117;

/**
 * A068919 Squarefree orders of non-Abelian groups.
 * @author Sean A. Irvine
 */
public class A068919 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A068919() {
    super(1, new A005117(), new A003277());
  }
}

