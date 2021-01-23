package irvine.oeis.a035;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a005.A005835;
import irvine.oeis.a007.A007620;

/**
 * A035480 Pseudoperfect numbers (A005835) that are not practical (second definition, A007620).
 * @author Sean A. Irvine
 */
public class A035480 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A035480() {
    super(new A005835(), new A007620());
  }
}

