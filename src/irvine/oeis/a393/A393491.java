package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A393491 Multiplicative sequence a(n) with a(p^e) = floor((e+1)/3) for prime p and e &gt; 0.
 * @author Sean A. Irvine
 */
public class A393491 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A393491() {
    super(1, (p, e) -> Z.valueOf((e + 1) / 3));
  }
}

