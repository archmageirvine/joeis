package irvine.oeis.a353;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353314 If n is of the form 3k, then a(n) = n, and if n is of the form 3k+r, with r = 1 or 2, then a(n) = 5*k + 3 + r.
 * @author Georg Fischer
 */
public class A353314 extends LambdaSequence {

  /** Construct the sequence. */
  public A353314() {
    super(0, n -> n % 3 == 0 ? Z.valueOf(n) : Z.valueOf(n / 3).multiply(5).add(3 + n % 3));
  }
}
