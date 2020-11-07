package gebhardt;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * Permutations.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
public class Globals {

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

	//typedef struct orbitelt orbitelt;
	static class orbitelt {
		long[] data = new long[2]; /* the antichains */
		int[] toRoot;  /* permutation to root */
		int gen;     /* index of generator whose application yielded the antichains */
	}

	//typedef struct SIdata SIdata;
	static class SIdata {
		long[] rep = new long[2];  /* the partially resorted antichains */
		int S;       /* S & BIT[j] indicates that the elements j-1 and j are in the same subset of the partition */
		int[] p;       /* initial permutation right-multiplied by the performed reordering of elements and antichains */
	}

	//typedef struct globals globals;
	//struct globals {
	int orbspace;
	int orbsize;
	orbitelt[] orb;
	int SIspace;
	long SI0size;
	SIdata[] SI0 = new SIdata[0];
	SIdata[] SI1 = new SIdata[0];
	TreeMap<Long, Long> orbpos; //hashtable[] orbpos;
	//};


	/*
	 * Double the number of orbit elements that can be stored.
	 */
	static void globals_enlargen_orbitspace(Globals GD) {
		GD.orbspace *= 2;
		GD.orb = Arrays.copyOf(GD.orb, GD.orbspace);
	}


	/*
	 * Double the number of SI data recordss that can be stored.
	 */
	static void globals_enlargen_SIspace(Globals GD) {
		GD.SIspace *= 2;
		GD.SI0 = Arrays.copyOf(GD.SI0, GD.SIspace);
		GD.SI1 = Arrays.copyOf(GD.SI1, GD.SIspace);
	}


	/**
	 * Initialise storage space for orbit/stabiliser computation.
	 */
	public static Globals globals_init() {
		final Globals GD = new Globals();
		GD.orbspace = Constants.ORBITS_INITIAL_ORBSPACE;
		GD.orbsize = 0;
		GD.orb = new orbitelt[Constants.ORBITS_INITIAL_ORBSPACE];
		for (int k = 0; k < GD.orb.length; ++k) {
			GD.orb[k] = new orbitelt();
		}
		GD.orbpos = new TreeMap<>(); //hashtable_init(ORBITS_HASHTABLE_LD_SIZE);
		GD.SIspace = Constants.ORBITS_INITIAL_SISPACE;
		GD.SI0 = new SIdata[Constants.ORBITS_INITIAL_SISPACE];
		GD.SI1 = new SIdata[Constants.ORBITS_INITIAL_SISPACE];
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
