package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A081001 n is in the sequence if and only if it does not rank among the top n positive integers in centrality (cf. A080997 for fuller explanation of this concept).
 * @author Sean A. Irvine
 */
public class A081001 extends ComplementSequence {

  /** Construct the sequence. */
  public A081001() {
    super(1, Z.ONE, new A081000());
  }
}

