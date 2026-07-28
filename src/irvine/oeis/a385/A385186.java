package irvine.oeis.a385;

import irvine.oeis.UnionSequence;
import irvine.oeis.a036.A036689;
import irvine.oeis.a036.A036690;

/**
 * A385186 allocated for Charles Kusniec.
 * @author Sean A. Irvine
 */
public class A385186 extends UnionSequence {

  /** Construct the sequence. */
  public A385186() {
    super(0, new A036689(), new A036690());
  }
}

