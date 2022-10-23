package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphProcessor;
import irvine.math.plantri.PlantriGraphState;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A007020 Maximal planar degree sequences with n nodes.
 * @author Sean A. Irvine
 */
public class A007020 extends Sequence3 implements PlantriGraphProcessor {

  private int mN = 2;
  private final HashSet<List<Integer>> mUniqueDegreeSequences = new HashSet<>();
  private final Plantri mPlantri = new Plantri();
  {
    mPlantri.setGraphProcessor(this);
  }

  @Override
  public boolean accept(final Plantri plantri, final PlantriGraphState state) {
    final ArrayList<Integer> deg = new ArrayList<>(state.order());
    for (int k = 0; k < state.order(); ++k) {
      deg.add(state.degree(k));
    }
    Collections.sort(deg);
    mUniqueDegreeSequences.add(deg);
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.ONE;
    }
    mUniqueDegreeSequences.clear();
    mPlantri.count(mN, -1, -1, -1, false, false, false, false); // A000109 calculation
    return Z.valueOf(mUniqueDegreeSequences.size());
  }

}

