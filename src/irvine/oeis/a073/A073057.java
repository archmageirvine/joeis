package irvine.oeis.a073;
// Generated by gen_seq4.pl morfps19/morfps at 2024-03-20 21:20

import irvine.oeis.base.MorphismFixedPointSequence;

/**
 * A073057 Start with the word 1234, repeatedly append the words obtained via the maps 1 -&gt; 12, 2 -&gt; 13, 3 -&gt; 42, 4 -&gt; 43.
 * @author Georg Fischer
 */
public class A073057 extends MorphismFixedPointSequence {

  /** Construct the sequence. */
  public A073057() {
    super(1, "1234", "word", "1->12, 2->13, 3->42, 4->43");
  }
}
