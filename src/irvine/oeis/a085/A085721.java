package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001358;

/**
 * A085721 Semiprimes whose prime factors have an equal number of digits in binary representation.
 * @author Sean A. Irvine
 */
public class A085721 extends FilterSequence {

  /** Construct the sequence. */
  public A085721() {
    super(1, new A001358(), k -> {
      final Z[] p = Jaguar.factor(k).toZArray();
      return Functions.DIGIT_LENGTH.i(2, p[0]) == Functions.DIGIT_LENGTH.i(2, p[p.length - 1]);
    });
  }
}
