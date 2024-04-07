package irvine.oeis.a104;
// manually 2024-03-31/ileave at 2024-04-03 09:28

import irvine.oeis.AlternatingSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a073.A073941;
import irvine.oeis.a081.A081848;

/**
 * A104740 a(1) = 1; for n &gt; 1: if n is even, a(n) = least k &gt; 0 such that sum(i=1,n/2,a(2*i-1))/sum(j=1,n,a(j))&gt;=1/4, or 1 if there is no such k; if n is odd, a(n) = largest k &gt; 0 such that sum(i=1,(n+1)/2,a(2*i-1))/sum(j=1,n,a(j))&lt;=1/3, or 1 if there is no such k.
 * or 1 if there is no such k; if n is odd, a(n) = largest k &gt; 0 such that sum(i=1,(n+1)/2,a(2*i-1))/sum(j=1,n,a(j))&lt;=1/3,
 * or 1 if there is no such k.
 * @author Georg Fischer
 */
public class A104740 extends PrependSequence {

  /** Construct the sequence. */
  public A104740() {
    super(new AlternatingSequence(1, new A073941(), new A081848()), 1, 3);
  }
}
