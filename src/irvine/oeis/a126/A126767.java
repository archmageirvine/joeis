package irvine.oeis.a126;

import irvine.oeis.FiniteSequence;

/**
 * A126767 Map the sentence "What is the next number in this sequence?" to numbers by translating each letter to its position in the alphabet <code>(a -&gt; 1,</code> b <code>-&gt; 2, </code>..., z <code>-&gt; 26)</code> and then adding the numbers corresponding to the letters in each word.
 * @author Georg Fischer
 */
public class A126767 extends FiniteSequence {

  /** Construct the sequence. */
  public A126767() {
    super(52, 28, 33, 63, 73, 23, 56, 89);
  }
}
