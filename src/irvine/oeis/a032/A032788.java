package irvine.oeis.a032;

/**
 * A032788 Numbers k such that <code>k(k+1)(k+2)...(k+19) / (k+(k+1)+(k+2)+...+(k+19))</code> is an integer.
 * @author Sean A. Irvine
 */
public class A032788 extends A032785 {

  @Override
  protected long t() {
    return 19;
  }
}

