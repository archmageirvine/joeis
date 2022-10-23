package irvine.oeis.a046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046523 Smallest number with same prime signature as n.
 * @author Sean A. Irvine
 */
public class A046523 extends Sequence1 {

  private final HashMap<List<Integer>, Z> mLeastBySignature = new HashMap<>();
  private long mN = 0;


  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final ArrayList<Integer> signature = new ArrayList<>(fs.omega());
    for (final Z p : fs.toZArray()) {
      signature.add(fs.getExponent(p));
    }
    Collections.sort(signature);
    final Z res = mLeastBySignature.get(signature);
    if (res == null) {
      final Z n = Z.valueOf(mN);
      mLeastBySignature.put(signature, n);
      return n;
    }
    return res;
  }
}

