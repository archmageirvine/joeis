package irvine.oeis.a300;
// Generated by gen_seq4.pl 2023-11-30/filter at 2023-12-03 21:34

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a055.A055120;

/**
 * A300447 Numbers x such that sigma(x) = sigma(y), with x&lt;&gt;y, where y is the 10's complement mod 10 of the digits of x.
 * @author Georg Fischer
 */
public class A300447 extends FilterSequence {

  /** Construct the sequence. */
  public A300447() {
    super(1, new A000027(), x -> {
      final Z y = new A055120().a(x);
      return !x.equals(y) && Functions.SIGMA1.z(x).equals(Functions.SIGMA1.z(y));
    });
  }
}
