package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a178.A178914;

/**
 * A083991 Members of A083989 whose 10's complement is also a member of A083989.
 * @author Sean A. Irvine
 */
public class A083991 extends FilterSequence {

  private static final A178914 SEQ = new A178914();

  /** Construct the sequence. */
  public A083991() {
    super(1, new A083989(), v -> {
      final Z t = Functions.TENS_COMPLEMENT.z(v);
      return t.isProbablePrime() && new Z(t + SEQ.a(t).toString()).isProbablePrime();
    });
  }
}
