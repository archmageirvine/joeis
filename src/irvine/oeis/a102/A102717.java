package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102717 &quot;Lightest&quot; sequence built with one &quot;1&quot;, two &quot;2&quot;, three &quot;3&quot;, ..., nine &quot;9&quot; (and no &quot;0&quot;). The weight of such a sequence is the total sum of its integers [the sequence is finite, by definition and a(n+1) must be &gt; a(n)].
 * @author Georg Fischer
 */
public class A102717 extends FiniteSequence {

  /** Construct the sequence. */
  public A102717() {
    super(5, 6, 7, 8, 9, 19, 28, 29, 37, 38, 39, 46, 47, 48, 49, 56, 57, 58, 59, 67, 68, 69, 78, 79, 89);
  }
}
