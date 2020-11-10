package gebhardt;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * Global information.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
public class Globals {

	// Original header:

	/*
	 * globals.c
	 *
	 * Created on: 11 Jul 2015
	 * Last modified: 24 Jan 2018
	 * Author: Volker Gebhardt, v.gebhardt@westernsydney.edu.au
	 *
	 *   Copyright (C) 2015-2018 by Volker Gebhardt
	 *
	 *   This program is free software; you can redistribute it and/or modify
	 *   it under the terms of the GNU General Public License as published by
	 *   the Free Software Foundation; either version 3 of the License, or
	 *   (at your option) any later version.
	 *
	 *   This program is distributed in the hope that it will be useful,
	 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
	 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	 *   GNU General Public License for more details.
	 *
	 *   You should have received a copy of the GNU General Public License
	 *   along with this program; if not, write to the
	 *   Free Software Foundation, Inc.,
	 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
	 */

	static class OrbitElement {
		long[] mData = new long[2]; /* the antichains */
		byte[] mToRoot = Permutation.create();  /* permutation to root */
		int mGen;     /* index of generator whose application yielded the antichains */
	}

	static class SiData {
		long[] mRep = new long[2];  /* the partially resorted antichains */
		int mS;       /* S & BIT[j] indicates that the elements j-1 and j are in the same subset of the partition */
		byte[] mP;       /* initial permutation right-multiplied by the performed reordering of elements and antichains */
	}

	int mOrbitSpace;
	int mOrbitSize;
	OrbitElement[] mOrbitElements;
	int mSiSpace;
	long mSi0Size;
	SiData[] mSi0;
	SiData[] mSi1;
	TreeMap<Long, Long> mOrbitPos;


	/*
	 * Double the number of orbit elements that can be stored.
	 */
	static void enlargenOrbitSpace(Globals globals) {
		globals.mOrbitSpace *= 2;
		int k = globals.mOrbitElements.length;
		globals.mOrbitElements = Arrays.copyOf(globals.mOrbitElements, globals.mOrbitSpace);
		while (k < globals.mOrbitElements.length) {
			globals.mOrbitElements[k++] = new OrbitElement();
		}
	}


	/*
	 * Double the number of SI data records that can be stored.
	 */
	static void globals_enlargen_SIspace(Globals GD) {
		GD.mSiSpace *= 2;
		int k = GD.mSi0.length;
		GD.mSi0 = Arrays.copyOf(GD.mSi0, GD.mSiSpace);
		GD.mSi1 = Arrays.copyOf(GD.mSi1, GD.mSiSpace);
		while (k < GD.mSi0.length) {
			GD.mSi0[k] = new SiData();
			GD.mSi1[k] = new SiData();
			++k;
		}
	}


	/**
	 * Initialise storage space for orbit/stabiliser computation.
	 */
	public static Globals globals_init() {
		final Globals GD = new Globals();
		GD.mOrbitSpace = Constants.ORBITS_INITIAL_ORBSPACE;
		GD.mOrbitSize = 0;
		GD.mOrbitElements = new OrbitElement[Constants.ORBITS_INITIAL_ORBSPACE];
		for (int k = 0; k < GD.mOrbitElements.length; ++k) {
			GD.mOrbitElements[k] = new OrbitElement();
		}
		GD.mOrbitPos = new TreeMap<>(); //hashtable_init(ORBITS_HASHTABLE_LD_SIZE);
		GD.mSiSpace = Constants.ORBITS_INITIAL_SISPACE;
		GD.mSi0 = new SiData[Constants.ORBITS_INITIAL_SISPACE];
		GD.mSi1 = new SiData[Constants.ORBITS_INITIAL_SISPACE];
		for (int k = 0; k < Constants.ORBITS_INITIAL_SISPACE; ++k) {
			GD.mSi0[k] = new SiData();
			GD.mSi1[k] = new SiData();
		}
		return GD;
	}


	/*
	 * Free allocated storage space for orbit/stabiliser computation.
	 */
	void globals_free(Globals GD) {
		// free(GD.orb);
		//     hashtable_free(GD.orbpos);
		//     free(GD.SI0);
		//     free(GD.SI1);
	}
}
