package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058059 Numbers n such that x^n + x + 2 is irreducible over GF(3).
 * @author Sean A. Irvine
 */
public class A058059 implements Sequence {

  // This is not very efficient!
  // Only a few terms can be generated

  protected static final PolynomialRingField<Z> GF3 = new PolynomialRingField<>(new GaloisField(3));
  private int mN = 1;

  // Terrible test for irreducibility -- it tries every possible polynomial of degree <= deg(p)/2.
  protected boolean isIrreducible(final Polynomial<Z> p) {
    final int deg = p.degree();
    //System.out.println("Testing: " + p);
    for (final Polynomial<Z> q : GF3) {
      if (q.degree() == 0) {
        continue; // skip 0, 1, 2
      }
      if (q.degree() > deg / 2) {
        return true;
      }
      if (GF3.zero().equals(GF3.mod(p, q))) {
        return false;
      }
    }
    throw new RuntimeException();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final List<Z> coeffs = new ArrayList<>();
      coeffs.add(Z.TWO);
      coeffs.add(Z.ONE);
      for (int k = 2; k < mN; ++k) {
        coeffs.add(Z.ZERO);
      }
      coeffs.add(Z.ONE);
      if (isIrreducible(GF3.create(coeffs))) {
        return Z.valueOf(mN);
      }
    }
  }
}

