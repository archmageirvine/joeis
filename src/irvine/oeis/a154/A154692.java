package irvine.oeis.a154;
// Generated by gen_seq4.pl trisumm/trisimple at 2023-06-09 19:35

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A154692 Triangle read by rows: T(n, k) = (2^(n-k)*3^k + 2^k*3^(n-k))*binomial(n, k).
 * @author Georg Fischer
 */
public class A154692 extends BaseTriangle {

  /** Construct the sequence. */
  public A154692() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Z.ONE.shiftLeft(n - k).multiply(Z.THREE.pow(k)).add(Z.ONE.shiftLeft(k).multiply(Z.THREE.pow(n - k))).multiply(Binomial.binomial(n, k));
  }
}
