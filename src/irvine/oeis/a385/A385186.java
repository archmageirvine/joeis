package irvine.oeis.a385;

import irvine.oeis.UnionSequence;
import irvine.oeis.a036.A036689;
import irvine.oeis.a036.A036690;

/**
 * A385186 Oblong numbers of the form k*(k + 1) such that at least one of k and k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A385186 extends UnionSequence {

  /** Construct the sequence. */
  public A385186() {
    super(0, new A036689(), new A036690());
  }
}

