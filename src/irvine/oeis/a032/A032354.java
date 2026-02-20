package irvine.oeis.a032;
// manually finifull at 2020-01-25 12:34

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A032354 j-invariants for orders of class number 1.
 * @author Georg Fischer
 */
public class A032354 extends FiniteSequence {

  /** Construct the sequence. */
  public A032354() {
    super(1, FINITE, Z.ZERO, new Z("1728"), new Z("-3375"), new Z("8000"), new Z("-32768"), new Z("54000"), new Z("287496"), new Z("-884736"), new Z("-12288000"), new Z("16581375"), new Z("-884736000"), new Z("-147197952000"), new Z("-262537412640768000"));
  }
}
