package irvine.oeis.a316;
// manually (morpfps) 2021-05-26

import irvine.math.z.Z;
import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A316329 Image of 3 under repeated applications of the morphism 1 -&gt; 11, 2 -&gt; 2, 3 -&gt; 312.
 * @author Georg Fischer
 */
public class A316329 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A316329() {
    super(0);
    configure("3", "331231", "1->11, 2->2, 3->312"); 
    // no initialize();
  }

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  @Override
  public Z next() {
    final Z result = new Z(mCurWord);
    expandWord();
    return result;
  } // next
}
