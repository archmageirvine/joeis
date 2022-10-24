package irvine.oeis.a046;

/**
 * A046425 Numbers requiring 5 steps to reach a prime under the prime factor concatenation procedure.
 * @author Sean A. Irvine
 */
public class A046425 extends A046422 {

  {
    setOffset(0);
  }

  @Override
  protected long target() {
    return 5;
  }
}
