package irvine.oeis.a106;

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A106704 5-limiting word of the morphism 1-&gt;56, 2-&gt;5555, 3-&gt;45, 4-&gt;3333, 5-&gt;123, 6-&gt;1111 starting from 1.
 * @author Sean A. Irvine
 */
public class A106704 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A106704() {
    super(0, "1", "5", "1->56, 2->5555, 3->45, 4->3333, 5->123, 6->1111");
  }
}

