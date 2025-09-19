package irvine.oeis.a387;

import irvine.oeis.UnionSequence;
import irvine.oeis.a014.A014574;
import irvine.oeis.a088.A088763;

/**
 * A387935 Numbers k such that Sum_{i=1..r} (k-i) and Sum_{i=1..s} (k+i) are both prime (A000040) for some 1 &lt;= r &lt; k, 1 &lt;= s &lt; k.
 * @author Sean A. Irvine
 */
public class A387935 extends UnionSequence {

  /** Construct the sequence. */
  public A387935() {
    super(new A014574(), new A088763());
  }
}
