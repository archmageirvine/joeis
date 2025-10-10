package irvine.oeis.a081;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a080.A080998;

/**
 * A081000 n is a member if and only if it ranks among top n positive integers in centrality (cf. A080997 for fuller description of this concept).
 * @author Sean A. Irvine
 */
public class A081000 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081000() {
    super(1, 1, new A080998(), (n, k) -> k.compareTo(n) <= 0);
  }
}

