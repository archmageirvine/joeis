package irvine.oeis.a158;
// Generated by gen_seq4.pl tricut2

import irvine.oeis.a004.A004736;
import irvine.oeis.a016.A016993;
import irvine.oeis.triangle.PrependColumn;

/**
 * A158893 Triangle read by rows: T(n,1)=7n-6; T(n,m)= 1+n-m, 1&lt;m&lt;=n.
 * @author Georg Fischer
 */
public class A158893 extends PrependColumn {

  /** Construct the sequence. */
  public A158893() {
    super(1, new A004736(), new A016993());
  }
}

