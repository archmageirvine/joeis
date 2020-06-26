package irvine.oeis.a032;

/**
 * A032787 Numbers k such that <code>k(k+1)(k+2)...(k+17) / (k+(k+1)+(k+2)+ ... +(k+17))</code> is an integer.
 * @author Sean A. Irvine
 */
public class A032787 extends A032785 {

  @Override
  protected long t() {
    return 17;
  }
}

